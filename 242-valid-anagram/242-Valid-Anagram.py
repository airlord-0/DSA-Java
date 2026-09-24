class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len (t)) :
            return False 
        
        countS = {}
        countT = {}
        for i in range len(s) :
            countS[s[i]] = s[i]
            countT = t[i]

        
        