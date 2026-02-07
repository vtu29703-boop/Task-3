import java.util.Scanner; 
class SlidingWindowMaximum { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
// Read array size 
System.out.print("Enter array size: "); 
int n = sc.nextInt(); 
int[] nums = new int[n]; 
// Read array elements 
System.out.println("Enter " + n + " array elements:"); 
for (int i = 0; i < n; i++) { 
nums[i] = sc.nextInt(); 
} 
// Read window size 
System.out.print("Enter window size: "); 
int k = sc.nextInt(); 
int[] result = new int[n - k + 1]; 
// Sliding window logic 
for (int i = 0; i <= n - k; i++) { 
int max = nums[i]; 
for (int j = i; j < i + k; j++) { 
if (nums[j] > max) { 
max = nums[j]; 
} 
} 
result[i] = max; 
} 
// Print result 
System.out.print("Sliding window maximum: "); 
for (int i = 0; i < result.length; i++) { 
System.out.print(result[i] + " "); 
} 
} 
}
