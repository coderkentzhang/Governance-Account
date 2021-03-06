/**
 * Copyright 2020 Webank.
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.webank.blockchain.gov.acct.exception;

/**
 * TransactionReceiptException @Description: TransactionReceiptException
 *
 * @author maojiayu
 * @data Apr 3, 2020 10:37:24 AM
 */
public class InvalidParamException extends RuntimeException {

    private static final long serialVersionUID = 2840173623914050978L;

    public static final InvalidParamException INVALID_PARAM =
            new InvalidParamException("Invalid param.");

    public InvalidParamException() {
        super();
    }

    public InvalidParamException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidParamException(String message) {
        super(message);
    }

    public InvalidParamException(Throwable cause) {
        super(cause);
    }
}
