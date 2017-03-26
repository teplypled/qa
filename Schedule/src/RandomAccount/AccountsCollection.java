/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomAccount;

import java.util.ArrayList;

/**
 *
 * @author Maryna
 */
    public class AccountsCollection {
    private ArrayList<Account> accCollection = new ArrayList<>();
    
    public void addToAccCollection(Account account){
    accCollection.add(account);
    }
    
    public ArrayList<Account> getAllRndAccounts(){
        return accCollection;
    }
}
