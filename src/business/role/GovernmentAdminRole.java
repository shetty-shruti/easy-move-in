/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.role;

import business.EcoSystem;
import business.account.Account;
import business.enterprise.Enterprise;
import business.network.Network;
import business.organization.GovernmentAdminOrganization;
import business.organization.Organization;
import javax.swing.JPanel;
import userInterface.governmentAdminRole.GovernmentAdminWorkAreaJPanel;

/**
 *
 * @author Hardik
 */
public class GovernmentAdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Account account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecoSystem) {
        return new GovernmentAdminWorkAreaJPanel(userProcessContainer, (GovernmentAdminOrganization) organization);
    }

}
