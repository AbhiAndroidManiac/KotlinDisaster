package SequenceOptimization

class ConceptCreationFile {
    //If you try to create an inline function like this
    //The warning shown by the compiler is:- Expected performance impact from
    // inlining is insignificant.

    //Inlining works best for functions with parameters of functional types

    /*Which roughly means that the JIT compiler itself is excellent at embedding code and
    there is no need to try to help it with this. Inline functions should only be used when
    passing parameters of a functional type to the function.*/

    /*This example demonstrates very well the fallacy of this misconception. Inline functions
     do not save the stack, or rather, that is not their essence. Inline should only be used
     if you are passing a functional type parameter to your function.*/
    private inline fun warningInlineFun(a:Int,b:Int):Int{
        return a+b
    }

    /*Popular misconception: inline functions save the number of methods.*/
    //Let see what our inline function compiles into in Java
   /* inline fun inlineFun(body: () -> String) {
        println("inline func code, " + body.invoke())
    }

    fun testInline() {
        inlineFun { "external code" }
    }*/

    //If you look at the decompiled Java code you will see the following
    /*public final void inlineFun(Function0 body) {
        String var2 = "inline func code, " + (String)body.invoke();
        System.out.println(var2);
    }

    public final void testInline() {
        String var1 = (new StringBuilder())
                      .append("inline func code, ")
                      .append("external code")
                      .toString();
        System.out.println(var1);
    }*/
    //As you can see, the inline function code has been inlined in place of the calling function,
    // but despite this, the original inlineFun function remains in the source code.
    //As you can see, the inline function code has been inlined in place of the calling function,
    // but despite this, the original inlineFun function remains in the source code.

    /*Profit of inline functions
    In order to understand what kind of profit you get from using inline functions, let’s look at
    an example of calling an inline function and a regular function.*/
    private inline fun inlineFun(body: () -> String) {
        println("inline func code, " + body.invoke())
    }
    fun testInline() {
        inlineFun { "external inline code" }
    }

    private fun regularFun(body: () -> String) {
        println("regular func code, " + body.invoke())
    }

    fun testRegular() {
        regularFun { "external regular code" }
    }
    //DECOMPILED  java code of the above kotlin is,
    //(I’m going to simplify the decompiled Java code a bit so as not to overload
    // you with unnecessary variables and Kotlin checks)
   /* public final void testInline() {
        String var4 = (new StringBuilder())
                .append("inline func code, ")
            .append("external inline code")
            .toString();
        System.out.println(var4);
    }

    public final void testRegular() {
        Function0 body = (Function0)(new Function0() {
            public final String invoke() {
                return "external regular code";
            }
        });
        this.regularFun(body);
    }*/
}