## 01. Value Equal to Position

The problem can be found at the following link: [Question Link](https://www.geeksforgeeks.org/problems/value-equal-to-index-value1330/1)

### Problem Description

**Task:** Given an array arr[], find the elements whose value is equal to the position where they appear.

> **Note:** There can be more than one element in the array which have the same value as its position. You need to include the position of every such element.

#### Examples

##### Example 1

- **Input:**
```text
arr[] = [15, 2, 45, 4, 7]
```
- **Output:**
```text
[2, 4]
```
- **Explanation:** Here, arr[2] = 2 exists here and arr[4] = 4 exists.

##### Example 2

- **Input:**
```text
arr[] = [1]
```
- **Output:**
```text
[1]
```
- **Explanation:** Here arr[1] = 1 exists.

### Time and Auxiliary Space Complexity

- **Expected Time Complexity:** O(n)
- **Expected Auxiliary Space Complexity:** O(1)

### Accepted Solutions (1)

#### Solution 1 (Java)

- **Submitted:** 2026-10-23 10:40:16
- **Status:** Correct
- **Marks:** 1

```java
import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

       
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i] == (i + 1)) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
```

*Generated on: 10/23/2026, 10:40:35 AM*