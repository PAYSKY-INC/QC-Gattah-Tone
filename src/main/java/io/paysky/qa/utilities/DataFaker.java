package io.paysky.qa.utilities;

import net.datafaker.Address;
import net.datafaker.Faker;

public class DataFaker {

    private final Faker faker;
    public DataFaker() {
        faker = new Faker();
    }
    public String egyMobileNumber(){
        return new String[]{"010", "011", "012", "015"}[faker.random().nextInt(4)]
                + faker.number().digits(8);
    }

    public String fullName(){return faker.name().fullName();}
    public String location(){return faker.name().title();}

    public String generateEmail(String fullName) {
        String[] nameParts = fullName.split(" ");
        String username = nameParts[0].toLowerCase() + "." + nameParts[nameParts.length - 1].toLowerCase();
        return username + "@example.com";
    }
    public String generateRandomGender() {
        // Use faker to generate random genders
        return faker.options().option("Male", "Female");}
    public String createNewPIN(){StringBuilder pin = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            // Generate the first digit without any checks
            if (i == 0) {
                pin.append(faker.number().numberBetween(0, 10));
                continue;
            }
            // For subsequent digits, ensure they are not sequential
            int nextDigit;
            do {
                nextDigit = faker.number().numberBetween(0, 10);
            } while (isSequential(pin.charAt(i - 1) - '0', nextDigit));

            pin.append(nextDigit);
        }
        return pin.toString();
    }

    private static boolean isSequential(int prevDigit, int nextDigit) {
        return Math.abs(prevDigit - nextDigit) == 1;
    }
   public String generateEGInvalidMobileNumber(){
       return faker.number().digits(11);
    }

    public String buisnessName() {return faker.name().name();}

    }

