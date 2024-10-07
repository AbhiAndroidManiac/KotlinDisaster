package KotlinHeroes11.Problem_A;

/**
 * A. Problem Solving
 * time limit per test2 seconds
 * memory limit per test512 megabytes
 * Jane has decided to solve a list of n
 *  problems on Codeforces. The i
 * -th problem in her list has difficulty di
 * , and the last problem in the list is the hardest one (for every problem j<n
 * , dj<dn
 * ).
 *
 * Jane's problem-solving skill is some integer x
 *  (unknown to you). If a problem's difficulty is greater than x
 * , then Jane cannot solve it, otherwise she can solve it.
 *
 * Jane has solved all problems form the list, except for the last one —
 * she found out that it was too difficult for her. Can you uniquely determine the value of x
 *  — Jane's problem solving skill?
 *
 * Input
 * The first line contains one integer t
 *  (1≤t≤1000
 * ) — the number of test cases.
 *
 * Each test case consists of two lines:
 *
 * the first line contains one integer n
 *  (2≤n≤50) — the number of problems;
 * the second line contains n
 *  integers d1,d2,…,dn (1≤di≤50).
 * Additional constraint on the input: in every test case,
 * the last problem is more difficult than every other problem (i. e. dn>djfor every j<n).
 * This means that at least one possible value of x
 *  exists.
 *
 * Output
 * For each test case, print one line:
 *
 * if you can determine the value of x
 *  uniquely, print x
 * ;
 * otherwise, print Ambiguous.
 * The checking program is case-sensitive,
 * so if you print ambiguous or AMBIGUOUS, your answer will be considered wrong.
 * example Input
 * 3
 * 5
 * 1 2 3 4 5
 * 8
 * 8 8 5 3 4 6 8 12
 * 4
 * 3 3 3 4
 *output
 * 4
 * Ambiguous
 * 3
 *
 */
