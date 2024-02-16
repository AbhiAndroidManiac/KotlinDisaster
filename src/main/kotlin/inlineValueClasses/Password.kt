package inlineValueClasses


//Inline value classes
/*Sometimes it is useful to wrap a value in a class to create a more domain-specific type.
However, it introduces runtime overhead due to additional heap allocations. Moreover, if the
wrapped type is primitive, the performance hit is significant, because primitive types are
usually heavily optimized by the runtime, while their wrappers don't get any special treatment.*/
@JvmInline
value class Password(private val s:String) {

}