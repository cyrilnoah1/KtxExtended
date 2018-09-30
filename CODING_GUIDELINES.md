# Coding Guidelines

Coding Guidelines are a set of source code and project based rules and regulations, which 
help standardize and maintain the code implementation format throughout the code base.

## Source Guidelines
The source code is maintained in [Kotlin](https://en.wikipedia.org/wiki/Kotlin_(programming_language)) 
programming language, and hence the language specific [coding conventions](https://kotlinlang.org/docs/reference/coding-conventions.html) 
are followed throughout the project. You can also refer to Android specific Kotlin guidelines [here](https://android.github.io/kotlin-guides/index.html).

## Project Specific Guidelines
The project specific guidelines are a common set of rules and regulations that are to be followed 
while structuring the source code implementation. 

### Naming Conventions and Structuring
**Following are the naming conventions for variables and values:**

* Non-public, non-static field names start with 'm'.
* Other fields start with a lower case letter.
* Public final fields (constants) are ALL_CAPS_WITH_UNDERSCORES.

```kotlin
    const val SOME_CONSTANT: Int = 42
    var publicField: String = "" 
    private var mPackagePrivate: Int
    private val mPrivate: Float
    protected var mProtected: List<Int>
    // (21/Jun/2018) TODO: Format for TODO comments
```

**Following are the naming conventions for common functions:**

```kotlin
    // The utility functions should be prefixed with "utl".
    fun utlIsNetworkAvailable(): Boolean {
    }
```

**Following is the function and variable structuring format:**
```kotlin
abstract class ChildClass() : ParentClass() {

    // Constants should be declared on the top.
    private const val MY_CONST: String = "myConstant"
    
    // The public, protected, and private variables should be placed in the
    // following order.
    val publicInt: Int = 40
    protected var protectedFloat: Float = 2.0f
    private val mToday: java.util.Date
    private lateinit var mLateLong: Long
    
    // Initial operation block should be placed right after the value and variable declaration.
    init {
        mToday = java.util.Date()
    }
    
    // Secondary constructors should be placed after any initial operations.
    constructor(){
        mLateLong = 21L
    }
    
    // Overridden functions should be placed above all the other functions.
    override fun dummy() {}
    
    // Public functions should be placed right after the overridden functions.
    fun getPublicName(): String = getDefaultPublicName()
    
    // Protected functions should be placed after the public functions.
    protected fun setProtectedString(): String
    
    // Private functions should be placed after the protected functions.
    private fun getDefaultPublicName(): String = "Public Name"
    
    // Inner classes should be placed after the function declarations.
    inner class InnerChild{
        fun <R> someInnerOperation() : R {
        // Do something.
        } 
    }
    
    // classes and interfaces should be declared after the inner classes.
    class ChildInChild{
    // Some logic.
    }
    
    interface SomeListener{
        fun <T> myListener(someResult: T)
    }
    
    // The companion objects should be declared at the end of the class.
    companion object {
        val TAG: String = ChildClass::class.java.simpleName
    }
}
```

### Android Specific Naming Conventions
All the Android specific naming guidelines should be maintained as per the guidelines mentioned 
[here](https://github.com/ribot/android-guidelines/blob/master/project_and_code_guidelines.md). 