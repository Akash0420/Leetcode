class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        int start=0;
        int end=letters.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(letters[mid]==target)
            {
                start=mid+1;
            }
            else if(target>letters[mid])
            {
                start=mid+1;
            }
            else if(letters[mid]>target)
            {
                res=letters[mid];
                end=mid-1;
            }
        }
        return res;
        
    }   
}
        
        /*int start=0;
        int end=letters.length-1;
        
        if(target >= letters[end])
            target = letters[0];
        else target++;

        while(start<=end)
        {
            int mid= start+(end-start/2);
            if(letters[mid]==target)
            {
                return letters[mid];
            }
            else if(letters[mid]<=target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
        }
       
    }
         return letters[start];
}
}*/