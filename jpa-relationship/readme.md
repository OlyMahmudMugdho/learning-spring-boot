# database relationships
## Tables
    - Student
    - Department
    - Course
    - Teacher
    - Account

### Relations:
#### One-to-One:
 - Student and Account : One student has one account.
#### Many-to-One:
 - Student and Department : Many students belongs to one department
 - Teacher and Department
 - Courses and Teacher : One teacher conducts many courses. But, a course has only one teacher.

#### Many-to-Many:
 - Student and Course : One student has many courses. One courses has many students.

### One-to-Many:
 - Teacher and Course