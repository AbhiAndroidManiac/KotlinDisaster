package sideEffectOfFunctions;

/*
The issue you're facing stems from how Kotlin's map function works. The map function expects a return value for each iteration of the list, but in your code, you're modifying isChecked directly on the elements, which is a side effect and not returning anything. This results in a type mismatch because map expects a transformed value, not a Unit (which is what happens when you modify an object in-place).

To fix this, you need to ensure that each element of the list is transformed into a new instance of DocumentTypeData (or some other transformation that returns a value of type DocumentTypeData). If you want to modify the isChecked property, you'll need to create a new instance of DocumentTypeData with the updated value.

Here's how you can fix your code:

Corrected Code:
kotlin
        Copy
localCopyOfdocTypeList = localCopyOfdocTypeList.map { docType ->
    if (docType.label.equals(label)) {
        // Return a modified copy of the item with updated isChecked
        docType.copy(isChecked = isChecked)
    } else {
        // Return the unchanged item
        docType.copy(isChecked = false)
    }
}.toMutableList()
Explanation:
map is used to iterate over each element in localCopyOfdocTypeList.
For each docType, check if its label matches the label you're comparing against.
If it matches, return a new instance of DocumentTypeData with the updated isChecked value (docType.copy(isChecked = isChecked)).
If it doesn't match, return a new instance of DocumentTypeData with isChecked set to false (docType.copy(isChecked = false)).
Finally, the result of map is converted to a MutableList using toMutableList().
Why this works:
copy is a function available for data classes in Kotlin. It creates a new instance of the data class with the same values as the original one, except for the properties you explicitly change (like isChecked).
This approach ensures that you're not modifying the original DocumentTypeData objects directly, which is important in functional programming styles (like map) and avoids side effects.
This should resolve the error and update the isChecked property as expected.*/
