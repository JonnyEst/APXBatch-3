package com.bbva.cpqr.batch.mock;

import com.bbva.cpqr.dto.datos.GrantingTicket;
import com.bbva.cpqr.dto.datos.OutAutehenticationGranting;
import com.bbva.cpqr.dto.datos.OutAuthentication;
import com.bbva.cpqr.lib.r052.CPQRR052;

public class CPQRR052Mock implements CPQRR052 {

    @Override
    public GrantingTicket execute(String consumerId, String idAuthenticationData) {
        return null;
    }

    @Override
    public OutAutehenticationGranting OutExecute(GrantingTicket grantingTicket) {
        OutAuthentication outAuthentication = new OutAuthentication();
        outAuthentication.setAuthenticationState("OK");

        OutAutehenticationGranting outAutehenticationGranting = new OutAutehenticationGranting();
        outAutehenticationGranting.setOutAuthentication(outAuthentication);

        return outAutehenticationGranting;
    }
}
