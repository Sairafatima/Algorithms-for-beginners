package assignment1;
import java.util.*;
import java.util.Random;
public class q4 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter rows of your array : ");
        int M=input.nextInt();         //input number of rows
        System.out.print("Enter columns of your array : ");
        int N=input.nextInt();         //input number of coulmns
        System.out.print("Enter probability : ");
        double P=input.nextDouble();        //input probability 
    
        String array[][]=new String[M][N];      //creating array of M rows and N column
        String array1[][]=new String[M+2][N+2];     //creating another array have M+2 rows and N+2 columns
        double bombs=M*N*P;     //calculting number of bombs
        int row;   
        int column;
        for (int i=0;i<bombs;i++){
        Random random=new Random();    //choosing random column for array
        column=0+random.nextInt(N);
        Random random1=new Random();
        row=0+random1.nextInt(M);       //choosing random row for array
        array[row][column]="*";         //placing bomb in first array
        array1[row+1][column+1]="*";        // placing bomb in second array at same position
        
        }
    System.out.println("  --------------------------------");
    for (int r=0;r<M;r++){
        for (int c=0;c<N;c++){
            if (array[r][c]!="*")
                    array[r][c]=".";        //assigning safe cell value to those cells of first array which do not have bomb
             
            System.out.print(" | "+array[r][c]+" | "); 
        }
        System.out.println("");
    }
    System.out.println("  --------------------------------");
    for (int r=0;r<M+2;r++){
        for (int c=0;c<N+2;c++){
             if (array1[r][c] !="*")
                 array1[r][c]=".";  //assigning safe cell value to those cells of second array which do not have bomb
        }
      
    }
    int x;
    for (int r=1;r<=M;r++){
       
        for (int j=1;j<=N;j++){
             x=0;
             //checking for all values of surrounding cells
            if (array1[r][j]=="*")
                 continue;
            if(array1[r-1][j-1]=="*")
                x+=1;
            if(array1[r-1][j]=="*")
                x+=1;
            if(array1[r-1][j+1]=="*")
                x+=1;
            if (array1[r][j-1]=="*")
                x+=1;
            if (array1[r][j+1]=="*")
                x+=1;
            if (array1[r+1][j-1]=="*")
                x+=1;
            if (array1[r+1][j]=="*")
                x+=1;
            if (array1[r+1][j+1]=="*")
                x+=1;
            array1[r][j]=""+x;
                      
  
          } 
      }
    System.out.println(" \n --------------------------------");
    for (int l=1;l<=M;l++){
        for (int m=1;m<=N;m++){
            System.out.print(" | "+array1[l][m]+" | ");
        }
        System.out.println("");
        
    }
    System.out.println("  --------------------------------");
     }
    
        
    
    
       }
    
