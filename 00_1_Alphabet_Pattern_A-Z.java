public class alphabets {

    public static void main(String[] args) {
        int n = 11;  // Set the height and width of the alphabet patterns

        // A pattern
        System.out.println("A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'A' with * at specific positions
                if (j == 0 || i == 0 || i == 5 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // B pattern
        System.out.println("B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'B' with * at specific positions
                if (j == 0 || i == 0 || i == 5 || j == n - 1 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // C pattern
        System.out.println("C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'C' with * at specific positions
                if (j == 0 || i == 0 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // D pattern
        System.out.println("D:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'D' with * at specific positions
                if (j == 0 || i == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // E pattern
        System.out.println("E:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'E' with * at specific positions
                if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // F pattern
        System.out.println("F:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'F' with * at specific positions
                if (j == 0 || i == 0 || i == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // G pattern
        System.out.println("G:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'G' with * at specific positions
                if (j == 0 || i == 0 || (i == n - 1 && j <= 6) || (j == 6 && i >= 6) ||
                        (i == 6 && (j <= 6 && j >= 2)) || (i == j && i >= 6)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // H pattern
        System.out.println("H:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'H' with * at specific positions
                if (j == 0 || i == 5 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // I pattern
        System.out.println("I:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'I' with * at specific positions
                if (i == 0 || j == 5 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // J pattern
        System.out.println("J:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'J' with * at specific positions
                if (i == 0 || j == 5 || i - j == n / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // K pattern
        System.out.println("K:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'K' with * at specific positions
                if (j == 5 || (i + j == n - 1 && j >= 5) || (i == j && i >= 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // L pattern
        System.out.println("L:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'L' with * at specific positions
                if (j == 0 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // M pattern
        System.out.println("M:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'M' with * at specific positions
                if (j == 0 || j == n - 1 || (i == j && i <= 5) || (i + j == n - 1 && j >= 5)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // N pattern
        System.out.println("N:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'N' with * at specific positions
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // O pattern
        System.out.println("O:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Draw the outline for letter 'O' with * at specific positions
                if (j == 0 || j == n - 1 || i == 0 || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("\n");

        // Add further letters (P-Z) following a similar pattern as above
    }
}


//		PPPPPPPPPPPPPPPPPP
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( j==0 || i==5  || i==0 || (j==n-1 && i<=5) ) {
				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		QQQQQQQQQQQQQQQQQQ
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( j==0 || j==n-1 || i==0 || i==n-1 || (i==j && i>=5)){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		RRRRRRRRRRRRRRRRR
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( j==0 || i==0 || i==5  || ((i==j) && i>=5 ) ||  (j==n-1 && i<=5) ){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
//		SSSSSSSSSSSSSSSSSSSSSSS
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( i==0 || i==n-1 || (j==0 && i<=5) || (j==n-1 && i>=5) || i==5){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		TTTTTTTTTTTTTTTT 
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( i==0 || j==5){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		UUUUUUUUUUUUUUUUUU
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( i==n-1 || j==0 || j==n-1){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		VVVVVVVVVVVVVVVVVVVV
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if( (j==0 && i<=5) || j==n-1 && i<=5 || i-j==n/2 ||  i==10-j+5  ){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		WWWWWWWWWWWWWWWWWWWWWWWWW
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if(  j==0 || j==n-1 || (i==j && i>=5) ||(i+j==n-1 && i>=5)){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		XXXXXXXXXXXXXXXXXXXXXXXXXX
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if(   i==j  ||i+j==n-1 ){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		YYYYYYYYYYYYYYYYYY
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if(   i==j && i<=5 ||  i+j==n-1 && i<=5 || i+j==n-1){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		
		System.out.println();
		System.out.println();
		
//		ZZZZZZZZZZZZZZZZZZZZZZZZ
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				if(   i==0  || i+j==n-1 || i==n-1 ){

				System.out.print("* ");
				}
				else 
				{
				System.out.print("  ");
				}
		    }
			System.out.println();			 
		}
		System.out.println();
	}
}
