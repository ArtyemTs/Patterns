package strategies;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CredetCard card;
}
