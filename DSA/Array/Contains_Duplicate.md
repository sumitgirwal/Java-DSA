# Contains Duplicate 

#### Approach 1: Brute Force O(n log n) TLE
Intuition:
The brute force approach compares each element with every other element in the array to check for duplicates. If any duplicates are found, it returns true. This approach is straightforward but has a time complexity of O(n^2), making it less efficient for large arrays.

Explanation:
The brute force approach involves comparing each element in the array with every other element to check for duplicates. If any duplicates are found, return true, otherwise return false.

Code:
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}
```

The time complexity of this approach is O(n^2), where n is the length of the array.
so, this approach is not efficient for large arrays -> TLE


#### Approach 2: Sorting O(n log n)
Intuition:
The sorting approach sorts the array in ascending order and then checks for adjacent elements that are the same. If any duplicates are found, it returns true. Sorting helps in bringing duplicates together, simplifying the check. However, sorting has a time complexity of O(n log n).

Explanation:
Another approach is to sort the array and then check for adjacent elements that are the same. If any duplicates are found, return true, otherwise return false.

Code:
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
```

The time complexity of this approach is O(n log n), where n is the length of the array.

#### Approach 3: Hash Set O(n)
Intuition:
The hash set approach uses a hash set data structure to store encountered elements. It iterates through the array, checking if an element is already in the set. If so, it returns true. Otherwise, it adds the element to the set. This approach has a time complexity of O(n) and provides an efficient way to check for duplicates.

Explanation:
A more efficient approach is to use a hash set data structure to store the encountered elements. While iterating through the array, if an element is already present in the hash set, return true. Otherwise, add the element to the hash set. If the loop completes without finding any duplicates, return false.

Code:

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
}
```

The time complexity of this approach is O(n), where n is the length of the array.

#### Approach 4: Hash Map O(n)
Intuition:
The hash map approach is similar to the hash set approach but also keeps track of the count of occurrences for each element. It uses a hash map to store the elements as keys and their counts as values. If a duplicate element is encountered (count greater than or equal to 1), it returns true. This approach provides more information than just the presence of duplicates and has a time complexity of O(n).

Explanation:
In this approach, we iterate through the array and store each element as a key in a hash map. The value associated with each key represents the count of occurrences of that element. If we encounter an element that already exists in the hash map with a count greater than or equal to 1, we return true, indicating that a duplicate has been found. Otherwise, we update the count of that element in the hash map. If we complete the iteration without finding any duplicates, we return false.

Code:
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
```