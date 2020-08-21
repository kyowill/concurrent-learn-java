package com;
import java.util.*;
public class Solution {

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l = 0;
        int r = position[position.length-1] - position[0] + 1;
        //f(l-1) >= m, f(r) < m
        while (l < r) {
            int mid = l + (r-l)/2;
            if(count(position, mid) < m) {
                r = mid;
            }else {
                l = mid + 1;
            }
        }
        return l-1;
    }

    int count(int[] position, int d){
        int ans = 1;
        int cur = position[0];
        for(int i = 1; i < position.length; i++){
            if(position[i] - cur >= d){
                ans++;
                cur = position[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}
