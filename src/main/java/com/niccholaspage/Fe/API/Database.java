package com.niccholaspage.Fe.API;

import org.bukkit.configuration.ConfigurationSection;

import java.util.List;
import java.util.UUID;

public interface Database {
    String getName();

    boolean isAsync();

    boolean initialize();

    void close();

    String getConfigName();

    ConfigurationSection getConfigSection();

    void getConfigDefaults(ConfigurationSection section);

    void onRenameAccount(Account account, String oldName, String newName);

    List<Account> loadAccounts();

    List<Account> getAccounts();

    List<Account> getTopAccounts(int size);

    boolean accountExists(UUID uuid);

    boolean accountExists(String name);

    Account createAccount(UUID uuid, String name);

    Account getAccount(UUID uuid);

    Account getAccount(String name);

    void saveAccount(Account account);

    void reloadAccount(Account account);

    void removeAccount(Account account);

    void cleanAccountsWithDefaultHoldings();

    void removeAllAccounts();
}
