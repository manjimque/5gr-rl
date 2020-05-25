////////////////////////////////////////////////////////////////////////////////////////
/**
 * 	# Copyright 2019 Centre Tecnol�gic de Telecomunicacions de Catalunya (CTTC/CERCA) www.cttc.es
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.

 * Author: Ricardo Mart�nez
 */
/////////////////////////////////////////////////////////////////////////////////////////

#ifndef _MTP_PA_SERVER_PA1000_H
#define _MTP_PA_SERVER_PA1000_H


#include <glib.h>
#include <glib/gstdio.h>
#include <glib-2.0/glib/gtypes.h>


// HTTP RETURN CODES
#define HTTP_CODE_OK					200
#define HTTP_CODE_CREATED 				201
#define HTTP_CODE_BAD_REQUEST    		400
#define HTTP_CODE_UNAUTHORIZED   		401
#define HTTP_CODE_FORBIDDEN      		403
#define HTTP_CODE_NOT_FOUND				404
#define HTTP_CODE_NOT_ACCEPTABLE		406


// Prototype of external declaration of functions
gint mtp_pa_server_pa1000_alg (struct compRouteOutput_t *);

#endif
