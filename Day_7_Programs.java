class Day_7_Programs {

    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Day_7_Programs program = new Day_7_Programs();

        // Test the containsDuplicate method with an example
        int[] nums = {1, 2, 3, 4, 5, 6, 2};
        boolean result = program.containsDuplicate(nums);

        // Print the result
        System.out.println("Contains duplicate: " + result);
    }
}
