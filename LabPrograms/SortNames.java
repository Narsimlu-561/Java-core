package LabPrograms;

public class SortNames {
	public static void main(String[] args) {
        System.out.println("Before Sorting..");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            System.out.println();
                for (int j = i + 1; j < args.length; j++) {
                    if (args[i].compareTo(args[j]) > 0) {
                        String temp = args[i];
                        args[i] = args[j];
                        args[j] = temp;
                    }
                }
            }
        System.out.println("After Sorting..");
        for(int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
            System.out.println();
        }
    }

}

