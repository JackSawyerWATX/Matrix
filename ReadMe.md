I'm trying to figure out what a matrix is and what it's used for. All I know about it is that it is a 2D array, but hwy would anyone ever need that?

In this commit I have built two different types of matrices in an attempt to try and understand 5 things:
    1. their structure 
    2. how they return data
    3. what that data is used for
    4. why the data is structured that way
    5. what the purpose of it is

Both matricies are iterative, but one takes in parameters from the user, where as the text Matrix does not. The data is hard written.

I'm going to do some more research and answer my questions from above. Recording them here will complete the record.


Efficient Java Matrix Library (EJML) is a linear algebra library for manipulating real/complex/dense/sparse matrices. Its design goals are: 
    1. to be as computationally and memory efficient as possible for both small and large matrices
    2. to be accessible to both novices and experts. 
These goals are accomplished by dynamically selecting the best algorithms to use at runtime, clean API, and multiple interfaces.

https://en.wikipedia.org/wiki/Efficient_Java_Matrix_Library#Introduction