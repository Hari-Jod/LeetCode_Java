class Solution(object):
    def lengthOfLastWord(self, s):
        n = len(s)
        i = n - 1
        lent = 0
        
        while i >= 0 and s[i] == ' ':
            i = i - 1
        while i >= 0 and s[i] != ' ':
            lent = lent + 1
            i = i - 1
        return lent