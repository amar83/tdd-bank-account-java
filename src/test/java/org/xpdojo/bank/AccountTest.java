package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void instantiateAccont(){
        Account account = new Account();
        assertThat(account.balance == 0);
    }

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        /*assertThat("your first test").isBlank();*/
        Account account = new Account();
        account.balance += 100;
        assertThat(account.balance == 100);
    }


}
