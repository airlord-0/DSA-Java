// // the question is ## Problem

// Starting with a **1-indexed array of zeros** and a list of operations, for each operation add a value to each array element between two given indices, **inclusive**.

// Once all operations have been performed, return the **maximum value in the array**.

// ### Example

// **Input:**

// ```text
// n = 10
// queries = [[1, 5, 3], [4, 8, 7], [6, 9, 1]]
// ```

// Each query is in the form:

// ```text
// [a, b, k]
// ```

// where:

// * `a` = starting index
// * `b` = ending index
// * `k` = value to add

// ### Operations

// For each query, add `k` to every element from index `a` through index `b`.

// After all operations, return the **maximum value in the array**.

// ### Expected Output

// ```text
// 10
// ```

// ### Explanation

// After applying:

// ```text
// [1, 5, 3]
// [4, 8, 7]
// [6, 9, 1]
// ```

// the final array is:

// ```text
// [3, 3, 3, 10, 10, 8, 8, 8, 1, 0]
// ```

// Therefore, the maximum value is:

// ```text
// 10
// ```

// class array_manipulation {
//     public static void manipulator (int n, int queries []) {
//         for (int a = )
//         for (int i = a; i<=b;i++) {
//             queries[i] += a;
//         }

//     }
// }