def removeDuplicates(arr,n):
    # Write your code here.
    last = arr[0]
    count = 1
    for i in arr:
        if last!=i:
            last = i
            count +=1
    
    return count