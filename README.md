# Arquitectura Seguridad Aws
This is a api rest that provides math methods to consume.

# Api rest methods
This api only have gets methods

## Sum method
To use this method you have to use this path
- {a} this numeric variable is to set the first value.
- {b} this numeric variable is to set the second value.
```
/api/v1/math/sum.{a}&{b}
```

+ **Example**:
    ```
    /api/v1/math/sum.1&2
    ```
    **Response**
    ```
    3
    ```
---
## Substrac method
To use this method you have to use this path
- {a} this numeric variable is to set the first value.
- {b} this numeric variable is to set the second value.
```
/api/v1/math/substrac.{a}&{b}
```

+ **Example**:
    ```
    /api/v1/math/substrac.2&1
    ```
    **Response**
    ```
    1
    ```
---
## Multiply method
To use this method you have to use this path
- {a} this numeric variable is to set the first value.
- {b} this numeric variable is to set the second value.
```
/api/v1/math/multiply.{a}&{b}
```

+ **Example**:
    ```
    /api/v1/math/multiply.2&3
    ```
    **Response**
    ```
    6
    ```
---
## Divide method
To use this method you have to use this path
- {a} this numeric variable is to set the first value.
- {b} this numeric variable is to set the second value.
```
/api/v1/math/divide.{a}&{b}
```

+ **Example**:
    ```
    /api/v1/math/divide.2&1
    ```
    **Response**
    ```
    2
    ```
---
## Square method
To use this method you have to use this path
- {a} this numeric variable is to set the first value.
```
/api/v1/math/square.{a}
```

+ **Example**:
    ```
    /api/v1/math/square.2
    ```
    **Response**
    ```
    4
    ```
---
## Exponent method
To use this method you have to use this path
- {a} this numeric variable is to set the first value.
- {b} this numeric variable is to set the second value.
```
/api/v1/math/exponent.{a}&{b}
```

+ **Example**:
    ```
    /api/v1/math/exponent.2&3
    ```
    **Response**
    ```
    8
    ```
---