package KotlinHeroes11.Problem_B;


/**
 * B. Shuffle
 *
 * Yes, this is another one of those constructive permutation problems.
 *
 * You are given an integer n. You have to construct a permutation p
 *  of size n.  i.e. an array of n integers, where every integer from 1
 *  to n appears exactly once.
 *
 * Every pair of adjacent elements in the permutation (pi and pi+1) must meet the following condition:
 *
 * if one of them is divisible by the other, the condition pi<pi+1 must hold;
 * otherwise, the condition pi>pi+1 must hold.
 * Input The first line contains one integer t
 *  (1≤t≤99) — the number of test cases.
 *
 * Each test case consists of one line, containing one integer n (2≤n≤100).
 *
 * Output
 * For each test case, print the answer as follows:
 * if no permutation of size n meeting the conditions from the statement exists, print −1;
 * otherwise, print n distinct integers from 1 to n — the required permutation.
 * If there are mutliple answers, print any of them.
 *
 * Example
 * 2
 * 5
 * 10
 *
 * Output
 * 1 5 2 4 3
 * 1 2 10 9 7 4 8 3 6 5
 */