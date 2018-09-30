# KTX Extended

KTX Extended utilises the existing Android KTX extensions and builds on it by providing additional 
Kotlin extensions that help aid your development. The library includes some support library 
extensions that help reduce the boilerplate in many of our Android projects. 

### Without KTX Extended
```kotlin
 override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA) 
                != PackageManager.PERMISSION_GRANTED){
            
            ActivityCompat.requestPermissions(
                    this, 
                    arrayOf(Manifest.permission.CAMERA),
                    CAMERA_REQUEST_CODE
                    )
                    
            // Handle the response in onRequestPermissionResult().
        }
        
    }
    
    companion object {
        const val CAMERA_REQUEST_CODE = 100
    }
```

### With KTX Extended
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(!checkCameraPermission()) requestCameraPermission()
        // Handle the response in onRequestPermissionResult().
    }
```

You can check the other extensions available in the library [here](extensions/src/main/java/com/cnoah/extensions).


## Contribution

The project follows a set of [coding guidelines](CODING_GUIDELINES.md), please check the guidelines 
before contributing to the project. Fork and put Pull Requests for the contribution.
