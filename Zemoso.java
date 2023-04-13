public class Zemoso {
    static int find(int a[])
    {
        int n =a.length;
        int k = 3;
        Vector<Integer> v = new Vector<Integer>();

        // Add the difference to vectors
        for(int i = 1; i < n; ++i)
        {
            v.add(a[i - 1] - a[i]);
        }

        // Sort vector to find minimum k
        Collections.sort(v);

        // Initialize result
        int res = a[n - 1] - a[0];

        // Adding first k-1 values
        for(int i = 0; i < k - 1; ++i)
        {
            res += v.get(i);
        }

        // Return the minimized sum
        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {

        // Given array arr[]
        int arr[] = { 4, 8, 15, 16, 23, 42 };


        // Given K
        int K = 3;

        // Function Call
        System.out.print(find(arr) + "\n");
    }
}
