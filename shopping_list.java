import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                    String[] shoppingList = new String[5];
                            int count = 0;

                                    System.out.println("Enter up to 5 items to buy:");

                                            // Step 1 & 2: Ask the user for items and store in array
                                                    for (int i = 0; i < shoppingList.length; i++) {
                                                                System.out.print("> ");
                                                                            String item = scanner.nextLine().trim();

                                                                                        // Stop early if user leaves input blank
                                                                                                    if (item.isEmpty()) {
                                                                                                                    break;
                                                                                                                                }

                                                                                                                                            shoppingList[count] = item;
                                                                                                                                                        count++;
                                                                                                                                                                }

                                                                                                                                                                        // Step 3: Print the complete shopping list
                                                                                                                                                                                System.out.println("\nYour shopping list:");
                                                                                                                                                                                        for (int i = 0; i < count; i++) {
                                                                                                                                                                                                    System.out.print(shoppingList[i]);
                                                                                                                                                                                                                if (i < count - 1) {
                                                                                                                                                                                                                                System.out.print(", ");
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                            // Step 4: Count how many items were entered
                                                                                                                                                                                                                                                                    System.out.println("\n\nYou entered " + count + " item" + (count == 1 ? "." : "s."));

                                                                                                                                                                                                                                                                            // Step 5 (Extra): Search feature
                                                                                                                                                                                                                                                                                    System.out.print("\nSearch for an item: ");
                                                                                                                                                                                                                                                                                            String searchItem = scanner.nextLine().trim();
                                                                                                                                                                                                                                                                                                    boolean found = false;

                                                                                                                                                                                                                                                                                                            for (int i = 0; i < count; i++) {
                                                                                                                                                                                                                                                                                                                        if (shoppingList[i].equalsIgnoreCase(searchItem)) {
                                                                                                                                                                                                                                                                                                                                        found = true;
                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                    if (found) {
                                                                                                                                                                                                                                                                                                                                                                                                System.out.println("✅ " + searchItem + " is in your shopping list!");
                                                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                                                                    System.out.println("❌ " + searchItem + " is not in your shopping list.");
                                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                                    scanner.close();
                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                        }