import java.util.Scanner; 
class AdjustedSum { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.print("Enter the size of the array: "); 
int N = sc.nextInt(); 
int[] arr = new int[N]; 
int sum = 0; 
System.out.println("Enter the array elements:"); 
for (int i = 0; i < N; i++) { 
arr[i] = sc.nextInt(); 
if (arr[i] % 2 == 0) { 
sum = sum + arr[i];   // Add even number 
} else { 
sum = sum - arr[i];   // Subtract odd number 
} 
} 
System.out.println("Adjusted Sum = " + sum); 
} 
} 
