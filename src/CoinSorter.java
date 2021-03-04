import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class CoinSorter {
	int minCoinIn = 0;
	int maxCoinIn = 10000;
	List<Integer> coinList = Arrays.asList(200, 100, 50, 20, 10);
	
	Set<Currency> currencySet  = Currency.getAvailableCurrencies();
	Currency currencyType = Currency.getInstance(Locale.UK);
	String currency = currencyType.getSymbol();
	String setCurrency;
	int setMinCoinValue;
	int setMaxCoinValue;
	int returnToMenu;
	int userChoice;
	int changeEntry;
	int type;
	int value;

	Scanner userInput = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public CoinSorter(String currencyValue, int minCoins, int maxCoins, List<Integer> coinListValue) {
		currency = currencyValue;
		minCoinIn = minCoins;
		maxCoinIn = maxCoins;
		coinList = coinListValue;
		}
	
	public CoinSorter() {

	}
	
	public void Menu() {
		try {
			System.out.print("\n *** Coin Sorter - Main Menu ***");

			System.out.print("\n\n 1 - Coin Calulcator");
			System.out.print("\n 2 - Multi Coin Calulcator");
			System.out.print("\n 3 - Print Coin List");
			System.out.print("\n 4 - Set Details");
			System.out.print("\n 5 - Display Progam Configurations");
			System.out.print("\n 6 - Quit the Program");
			
			System.out.print("\n\n Select an Option: ");
			userChoice = userInput.nextInt();
			
			if (userChoice == 1) {
				coinCalculator(changeEntry, type);
			}
			
			else if (userChoice == 2) {
				multiCoinCalculator(changeEntry, type);
			}
			
			else if (userChoice == 3) {
				printCoinList();
			}
			
			else if (userChoice == 4) {
				subMenu();
			}
			
			else if (userChoice == 5) {
				displayProgramConfigs();
			}
			
			else if (userChoice == 6) {
				System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); 
			    java.lang.System.exit(0);
			}
			
			else {
				System.out.print("\n You didnt select an option from the menu, try again...");
				System.out.print("\n\n Press Enter to Return to Main Menu");
				br.readLine();
				Menu();
			}
			
		} 
		
		catch (Exception e) { 
			// Prevents error when user enters in a non numerical character.
			System.out.print("\n You didnt select an option from the menu, restart progam and try again...");
		}
		
	}
	
	public void subMenu() {
		System.out.print("\n *** Set Details - Sub Menu ***");

		System.out.print("\n\n 1 - Set Currency");
		System.out.print("\n 2 - Set Minimum Coin Input Value");
		System.out.print("\n 3 - Set Maximum Coin Input Value");
		System.out.print("\n 4 - Return to Main Menu");
		
		System.out.print("\n\n Select an Option: ");
		userChoice = userInput.nextInt();
		
		if (userChoice == 1) {
			setCurrency();
		}
		
		else if (userChoice == 2) {
			try {
				
				System.out.print("\n\n Set New System Minimum Coin Input Value: ");
				setMinCoinValue = userInput.nextInt();
				
				if (setMinCoinValue >= 0) {
					setMinCoinIn(setMinCoinValue);
					System.out.print("\n\n Press Enter to Return to Sub Menu");
					br.readLine();
					subMenu();
				}
				else {
					System.out.print("\n Value cannot be less than 0");
					System.out.print("\n\n Press Enter to Return to Sub Menu");
					br.readLine();
					subMenu();
				}
				
			} catch (Exception e) {
				System.out.print("\n\n Incorrect format, restart program and try again"); // Prevents non-numerical characters being entered
			}
		}
		
		else if (userChoice == 3) {
			try {
				
				System.out.print("\n\n Set New System Maximum Coin Input Value: ");
				setMaxCoinValue = userInput.nextInt();
				
				if (setMaxCoinValue >= 0) {
					setMaxCoinIn(setMaxCoinValue);
					System.out.print("\n\n Press Enter to Return to Sub Menu");
					br.readLine();
					subMenu();
				}
				else {
					System.out.print("\n Value cannot be less than 0");
					System.out.print("\n\n Press Enter to Return to Sub Menu");
					br.readLine();
					subMenu();
				}
				
			} catch (Exception e) {
				System.out.print("\n\n Incorrect format, restart program and try again"); // Prevents non-numerical characters being entered
			}
		}
		
		else if (userChoice == 4) {
			Menu();
		}
		
		else {
			System.out.print("\n You Didn't Enter a Value From the Sub Menu");
			System.out.print("\n\n Press Enter to Return to Main Menu");
			
			try {
				br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			Menu();
		}
	}
	
	public void setCurrency() {
		
		System.out.print("\n - Currencies Available to System - \n\n ");
		
		for (Currency currenciesAvailable : currencySet) {
			System.out.print("• Currency Code: " + currenciesAvailable.getCurrencyCode() + "\n   (" + currenciesAvailable.getDisplayName() + ")\n\n ");
			}
		
		try 
		{
			System.out.print("\n * Current System Currency: " + currencyType.getDisplayName() + " (" + currencyType.getSymbol() + ")");
			System.out.print("\n\n Set New System Currency Code: ");
			setCurrency = userInput.next();
			currencyType = Currency.getInstance(setCurrency.toUpperCase()); // Even if user enters currency code in lower case it will be set automatically for them.
			
			System.out.print("\n * New System Currency: " + currencyType.getDisplayName() + " (" + currencyType.getSymbol() + ")");
			
			System.out.print("\n\n Press Enter to Return to Sub Menu");
			br.readLine();
			subMenu();
		} 
		
		catch (Exception IllegalArgumentException) { // Verifies that currency code matches the available system currencies
			System.out.print("\n Error, you need to enter a currency code from the list of available currencies.\n\n Restart program and try again...");
			}
			//currencyValue = setCurrency;
		}
	
	public void setMinCoinIn(int minCoins) {
		minCoinIn = minCoins;
	}
	
	public void setMaxCoinIn(int maxCoins) {
		maxCoinIn = maxCoins;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public int getMinCoinIn() {
		return minCoinIn;
	}
	
	public int getMaxCoinIn() {
		return maxCoinIn;
	}
	
	public void printCoinList() {
		
		System.out.println("\n - Denominations Currently in Circulation- \n");
				
		for (Integer coin : coinList) {
			System.out.println(" • " + coin);
			}
			
			System.out.print("\n Press Enter to Return to Main Menu");
			try {
				br.readLine();
			} 
			
			catch (IOException e){
				e.printStackTrace();
				}
			
			Menu();
		}
	
	public void coinCalculator(int changeValue, int coinType) {
		
		System.out.print("\n - Coin Calculator - ");

		System.out.print("\n\n Note - Amount entered cannot be less than " + minCoinIn + " or greater than " + maxCoinIn + " coins. ");

		try { // If a numerical value is entered then the try will be activated successfully

			System.out.print("\n\n Please enter coin value: ");
			changeEntry = userInput.nextInt();
			changeValue = changeEntry;

			if (changeValue < minCoinIn || changeValue > maxCoinIn) {
				System.out.print("\n Sorry, the amount you entered was either less than " + minCoinIn + " or greater than " + maxCoinIn + "." );
			System.out.print("\n\n Press Enter to Return to Main Menu");
			br.readLine();
			Menu();
			}

			else {

				System.out.print("\n Please enter the coin type want to evaluate (Options: " + coinList.get(0) + ", "
						+ coinList.get(1) + ", " + coinList.get(2) + ", " + coinList.get(3) + ", " + coinList.get(4) + "): ");

				type = userInput.nextInt();
				coinType = type;

				if (coinType == coinList.get(0) || coinType == coinList.get(1) || coinType == coinList.get(2)
						|| coinType == coinList.get(3) || coinType == coinList.get(4)) {

					System.out.print("\n A total of ");

					if (coinType == coinList.get(0)) {
						System.out
								.print(" " + changeValue / 200 + " x " + coinList.get(0) + "p coins can be exchanged");
						changeValue = changeValue % 200;
					}

					else if (coinType == coinList.get(1)) {
						System.out
								.print(" " + changeValue / 100 + " x " + coinList.get(1) + "p coins can be exchanged");
						changeValue = changeValue % 100;
					}

					else if (coinType == coinList.get(2)) {
						System.out.print(" " + changeValue / 50 + " x " + coinList.get(2) + "p coins can be exchanged");
						changeValue = changeValue % 50;
					}

					else if (coinType == coinList.get(3)) {
						System.out.print(" " + changeValue / 20 + " x " + coinList.get(3) + "p coins can be exchanged");
						changeValue = changeValue % 20;
					}

					else if (coinType == coinList.get(4)) {
						System.out.print(" " + changeValue / 10 + " x " + coinList.get(4) + "p coins can be exchanged");
						changeValue = changeValue % 10;
					}

					if (changeValue > 0) {
						System.out.print(", with a remainder of " + changeValue + "p.");
					}
					
					System.out.print("\n\n Press Enter to Return to Main Menu");
					br.readLine();
					Menu();
				}

				else {
					System.out.print("\n Sorry, you didn't enter a valid coin value.");
					System.out.print("\n\n Press Enter to Return to Main Menu");
					br.readLine();
					Menu();
				}
			}
		}

		catch (Exception InputMismatchException) {
			// Return message to user if they enter anything but a number
			System.out.print("\n Incorrect input, you need to enter a numerical value.\n\n Restart program and try again...");
			}
		}

	public void multiCoinCalculator(int totalExchangeValue, int coinTypeExclusion) {
		System.out.print("\n - Multi Coin Calculator - ");

		System.out.print("\n\n Note - Amount entered cannot be less than " + minCoinIn + " or greater than " + maxCoinIn + " coins. ");

		try {

			System.out.print("\n\n Please enter coin value: ");
			changeEntry = userInput.nextInt();
			totalExchangeValue = changeEntry;

			if (totalExchangeValue < minCoinIn || totalExchangeValue > maxCoinIn) {
				System.out.print("\n Sorry, the amount you entered was either less than " + minCoinIn + " or greater than " + maxCoinIn + "." );
				System.out.print("\n\n Press Enter to Return to Main Menu: ");
				br.readLine();
				Menu();
			}

			else {
				System.out.print("\n Please enter the coin type want to exclude (Options: " + coinList.get(0) + ", " 
			+ coinList.get(1) + ", " + coinList.get(2) + ", " + coinList.get(3) + ", " + coinList.get(4) + "): ");

				type = userInput.nextInt();
				coinTypeExclusion = type;

				if (coinTypeExclusion == coinList.get(0) || coinTypeExclusion == coinList.get(1) || coinTypeExclusion == coinList.get(2) 
						|| coinTypeExclusion == coinList.get(3) || coinTypeExclusion == coinList.get(4)) {

					if (coinTypeExclusion == coinList.get(0)) {
						System.out.print("\n The coins echanged are: 0 x " + coinList.get(0) + "p, ");

						System.out.print(totalExchangeValue / 100 + " x " + coinList.get(1) + "p, ");
						totalExchangeValue = totalExchangeValue % 100;

						System.out.print(totalExchangeValue / 50 + " x " + coinList.get(2) + "p, ");
						totalExchangeValue = totalExchangeValue % 50;

						System.out.print(totalExchangeValue / 20 + " x " + coinList.get(3) + "p, ");
						totalExchangeValue = totalExchangeValue % 20;

						System.out.print(totalExchangeValue / 10 + " x " + coinList.get(4) + "p");
						totalExchangeValue = totalExchangeValue % 10;
					}

					else if (coinTypeExclusion == coinList.get(1)) {
						System.out.print("\n The coins echanged are: " + totalExchangeValue / 200 + " x " + coinList.get(0) + "p, ");
						totalExchangeValue = totalExchangeValue % 200;

						System.out.print("0" + " x " + coinList.get(1) + "p, ");

						System.out.print(totalExchangeValue / 50 + " x " + coinList.get(2) + "p, ");
						totalExchangeValue = totalExchangeValue % 50;

						System.out.print(totalExchangeValue / 20 + " x " + coinList.get(3) + "p, ");
						totalExchangeValue = totalExchangeValue % 20;

						System.out.print(totalExchangeValue / 10 + " x " + coinList.get(4) + "p");
						totalExchangeValue = totalExchangeValue % 10;
					}

					else if (coinTypeExclusion == coinList.get(2)) {
						System.out.print("\n The coins echanged are: " + totalExchangeValue / 200 + " x " + coinList.get(0) + "p, ");
						totalExchangeValue = totalExchangeValue % 200;

						System.out.print(totalExchangeValue / 100 + " x " + coinList.get(1) + "p, ");
						totalExchangeValue = totalExchangeValue % 100;

						System.out.print("0" + " x " + coinList.get(2) + "p, ");

						System.out.print(totalExchangeValue / 20 + " x " + coinList.get(3) + "p, ");
						totalExchangeValue = totalExchangeValue % 20;

						System.out.print(totalExchangeValue / 10 + " x " + coinList.get(4) + "p");
						totalExchangeValue = totalExchangeValue % 10;
					}

					else if (coinTypeExclusion == coinList.get(3)) {
						System.out.print("\n The coins echanged are: " + totalExchangeValue / 200 + " x " + coinList.get(0) + "p, ");
						totalExchangeValue = totalExchangeValue % 200;

						System.out.print(totalExchangeValue / 100 + " x " + coinList.get(1) + "p, ");
						totalExchangeValue = totalExchangeValue % 100;

						System.out.print(totalExchangeValue / 50 + " x " + coinList.get(2) + "p, ");
						totalExchangeValue = totalExchangeValue % 50;

						System.out.print("0" + " x " + coinList.get(3) + "p, ");

						System.out.print(totalExchangeValue / 10 + " x " + coinList.get(4) + "p");
						totalExchangeValue = totalExchangeValue % 10;
					}

					else if (coinTypeExclusion == coinList.get(4)) {
						System.out.print("\n The coins echanged are: " + totalExchangeValue / 200 + " x " + coinList.get(0) + "p, ");
						totalExchangeValue = totalExchangeValue % 200;

						System.out.print(totalExchangeValue / 100 + " x " + coinList.get(1) + "p, ");
						totalExchangeValue = totalExchangeValue % 100;

						System.out.print(totalExchangeValue / 50 + " x " + coinList.get(2) + "p, ");
						totalExchangeValue = totalExchangeValue % 50;

						System.out.print(totalExchangeValue / 20 + " x " + coinList.get(3) + "p, ");
						totalExchangeValue = totalExchangeValue % 20;

						System.out.print("0" + " x " + coinList.get(4) + "p");
					}

					if (totalExchangeValue > 0) {
						System.out.print(", with a remainder of " + totalExchangeValue + "p.");
						}

					else {
						System.out.print(".");
						}
					
					 System.out.print("\n\n Press Enter to Return to Main Menu: ");
					 br.readLine(); 
					 Menu();	
					}

				else {
					System.out.print("\n Sorry, you didn't enter a valid coin value.");
					System.out.print("\n\n Press Enter to Return to Main Menu");
					br.readLine();
					Menu();
					}
				}
			}

		catch (Exception e) {
			System.out.print("\n Incorrect input, you need to enter a numerical value.\n\n Restart program and try again...");
			}
		}

	public void displayProgramConfigs() {
		System.out.print("\n - System Currency Information - ");
		
		// Functionality added to display currency in a traditional decimal format in the system menu
		System.out.format("\n\n Current System Currency: " + currencyType.getDisplayName() + "\n\n" + " Current Minimum Currency Value: (" 
		+ currencyType.getSymbol() + ") %.2f" + "\n\n Current Maximum Currency Value: (" + currencyType.getSymbol() + ") %.2f", (double) minCoinIn, (double) maxCoinIn); 
		
		System.out.print("\n\n Press Enter to Return to Main Menu");
		try {
			br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Menu();
	}
}