package org.mifos.connector.channel.api.definition;

import com.fasterxml.jackson.core.*;
import org.mifos.connector.channel.GSMA_API.*;
import org.mifos.connector.common.gsma.dto.*;
import org.springframework.web.bind.annotation.*;

import static org.mifos.connector.channel.camel.config.CamelProperties.CLIENTCORRELATIONID;

public interface GSMATransactionApi {
    @PostMapping("/channel/gsma/transaction")
    GsmaP2PResponseDto gsmatransaction(@RequestBody GsmaTransfer requestBody,
                                       @RequestHeader(value = CLIENTCORRELATIONID,required = false) String correlationId,
                                       @RequestHeader(value = "amsName") String amsName,
                                       @RequestHeader(value = "accountHoldingInstitutionId") String accountHoldId) throws JsonProcessingException;
}
