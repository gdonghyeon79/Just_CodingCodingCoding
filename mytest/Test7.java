package mytest;

/*
Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore

@gdonghyeon79
raagz628
/
codility
0
00
 Code
 Issues 0
 Pull requests 0 Actions
 Projects 0
 Wiki
 Security 0
 Insights
codility/Prob1.txt
@raagz628 raagz628 Add files via upload
4fdefca on 10 Sep 2018
42 lines (29 sloc)  1.32 KB

A non-empty zero indexed array A consisting of N integers is given.

You can perform a single swap operation in array A. This operation takes two indices I and J, such that 0<=I<=J<N, and exchanges the value of A[I] and A[J].

The goal is to check whether array A can be sorted into non decreasing order by performing at most one swap operation.
For example, consider array a such that:

A[0]=1
A[1]=5
A[2]=3
A[3]=3
A[4]=7

After exchanging the values A[1] and A[3] we obtain an array [1,3,3,5,7] which is sorted in non- decreasing order.

Write a function :-

class Solution { public boolean solution (int[] A);}

that, given a non empty zero-indexed array A consisting of N integers, returns true if the arraycan be sorted into non-decreasing order by performing at most one swap operation or false otherwise.

For eg. given:

A[0]=1
A[1]=3
A[2]=5
A[3]=3
A[4]=4

the function should return false, as there is no single swap operation that sorts the array.

For the following array:
A[0]=1
A[1]=3
A[2]=5
the funtion will return true as the given array is already sorted

Assume that:
N is an integer within the range [1..100].
each element of Array A is an integerwithin the range [1..1,000,000,000].

 */
public class Test7 {
}
