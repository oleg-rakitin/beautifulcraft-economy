package com.niccholaspage.Fe.API;

import java.util.UUID;

public interface Account extends Comparable<Account> {
    UUID getUUID();

    String getName();

    void setName(String name);

    double getMoney();

    void setMoney(double money);

    boolean has(double amount);

    boolean canReceive(double amount);

    void deposit(double amount);

    void withdraw(double amount);
}
