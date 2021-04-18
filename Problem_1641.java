class Solution {
    public int countVowelStrings(int n) {
        int a = 1, e=1,i=1, o=1,u=1;
int ans=0;
for(int k=1;k<=n;k++){
ans = a+e+i+o+u;
a=ans;
e=e+i+o+u;
i=i+o+u;
o=o+u;
u=u;
}
return ans;
    }
}