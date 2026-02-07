import java.util.Scanner; 
class RotateMaxDifference { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the size of the array: "); 
int N = sc.nextInt(); 
int[] arr = new int[N]; 
int[] rotated = new int[N]; 
System.out.println("Enter the array elements:"); 
for (int i = 0; i < N; i++) { 
arr[i] = sc.nextInt(); 
} 
System.out.print("Enter K value: "); 
int K = sc.nextInt(); 
K = K % N; // Handle cases where K > N 
// Rotate array to the right 
for (int i = 0; i < N; i++) { 
rotated[(i + K) % N] = arr[i]; 
} 
// Find maximum absolute difference 
int maxDiff = 0; 
for (int i = 0; i < N - 1; i++) { 
int diff = Math.abs(rotated[i] - rotated[i + 1]); 
if (diff > maxDiff) { 
maxDiff = diff; 
} 
} 
// Display rotated array 
System.out.println("Rotated Array:"); 
for (int num : rotated) { 
System.out.print(num + " "); 
} 
System.out.println("\nMaximum difference = " + maxDiff); 
} 
}
