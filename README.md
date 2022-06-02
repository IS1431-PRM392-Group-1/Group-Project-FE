# Group-Project-FE

## Git branch control rule:

#### 1. development branch:

The development branch is used to assemble code during application development. 
Note, always pull the code from development to update the latest version to avoid config git error.

Move to your function branch
```shell
git checkout <your-function-branch>
```
Get latest version code from development branch
```shell
git pull origin development
```
#### 2. create new function branch:

Name rule: feature/function-name

#### 3. commit code:

Just commit your coding file to avoid config git error.

#### 4. pull request:

Make sure the code is working and has updated to the latest version from development before making a pull request.

## Java structure
+-- java/com/is1431_prm392_group_project/is1431_prm392_group_project
|   +-- config // Environment Configuration
|   +-- entity // Entities generated
|   +-- modules
|   |   +-- auth // Authentication
|   |   +-- common // Global Android Module
|   |   |   +-- constants // Constant value and Enum
|   |   |   +-- controllers // Android Controllers
|   |   |   +-- decorators // Android Decorators
|   |   |   +-- dto // DTO (Data Transfer Object) Schema, Validation
|   |   |   +-- filters // Android Filters
|   |   |   +-- guards // Android Guards
|   |   |   +-- interceptors // Android Interceptors
|   |   |   +-- interfaces // TypeScript Interfaces
|   |   |   +-- middleware // Android Middleware
|   |   |   +-- pipes // Android Pipes
|   |   |   +-- providers // Android Providers
|   |   |   +-- * // models, repositories, services...
|   |   |   +-- shared // Shared Android Modules
|   |   |   +-- gql // GraphQL Structure Sample
|   |   +-- * // Other Android Modules, non-global, same as common structure above
## User manual

#### 1. Requirements

-android studio(https://developer.android.com/studio)