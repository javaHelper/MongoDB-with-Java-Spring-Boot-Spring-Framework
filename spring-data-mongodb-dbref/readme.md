# Spring Data MongoDB DBRef

```
curl --location --request POST 'http://localhost:8080/api/student/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Steve",
    "email": "steve@gmail.com",
    "department": {
        "departmentName": "IT",
        "location": "USA"
    },
    "subjects": [
        {
            "subjectName": "Java",
            "marksObtained": 77
        },
        {
            "subjectName": "C++",
            "marksObtained": 75
        }
    ]
}'
```

Response:

```
{
    "id": "63aaa9b06f9a234b16adf1cd",
    "name": "Steve",
    "email": "steve@gmail.com",
    "department": {
        "id": "63aaa9b06f9a234b16adf1ca",
        "departmentName": "IT",
        "location": "USA"
    },
    "subjects": [
        {
            "id": "63aaa9b06f9a234b16adf1cb",
            "subjectName": "Java",
            "marksObtained": 77
        },
        {
            "id": "63aaa9b06f9a234b16adf1cc",
            "subjectName": "C++",
            "marksObtained": 75
        }
    ],
    "percentage": 76.0
}
```

--------

# Find By Department Id 

```sh
curl --location --request GET 'http://localhost:8080/api/student/byDepartmentId?deptId=63aaa9b06f9a234b16adf1ca'
```

Response:

```json
[
    {
        "id": "63aaa9b06f9a234b16adf1cd",
        "name": "Steve",
        "email": "steve@gmail.com",
        "department": {
            "id": "63aaa9b06f9a234b16adf1ca",
            "departmentName": "IT",
            "location": "USA"
        },
        "subjects": [
            {
                "id": "63aaa9b06f9a234b16adf1cb",
                "subjectName": "Java",
                "marksObtained": 77
            },
            {
                "id": "63aaa9b06f9a234b16adf1cc",
                "subjectName": "C++",
                "marksObtained": 75
            }
        ],
        "percentage": 76.0
    }
]
```


http://localhost:8080/api/student/getstudentsByName/Steve

```
[
    {
        "id": "63aaa9b06f9a234b16adf1cd",
        "name": "Steve",
        "email": "steve@gmail.com",
        "department": {
            "id": "63aaa9b06f9a234b16adf1ca",
            "departmentName": "IT",
            "location": "USA"
        },
        "subjects": [
            {
                "id": "63aaa9b06f9a234b16adf1cb",
                "subjectName": "Java",
                "marksObtained": 77
            },
            {
                "id": "63aaa9b06f9a234b16adf1cc",
                "subjectName": "C++",
                "marksObtained": 75
            }
        ],
        "percentage": 76.0
    }
]
```




