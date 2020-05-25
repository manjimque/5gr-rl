# Copyright 2020 Centre Tecnològic de Telecomunicacions de Catalunya (CTTC/CERCA) www.cttc.es
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# Author: Luca Vettori

from logging import getLogger, Formatter, StreamHandler, INFO
from logging.handlers import RotatingFileHandler


def configure_log(log_file, log_level=INFO):
    """
    Create a log file if it doesn't exist
    :param log_file: string (name of complete path)
    :param log_level: level of log
    :return: logger
    """

    # config log
    logger = getLogger("cttc_rl")  # to exclude "werkzeug" logs
    handler = RotatingFileHandler(log_file, maxBytes=1000000, backupCount=3)

    # log format
    formatter = Formatter("%(asctime)s - "
                          # "{%(pathname)s:%(lineno)d} - "
                          "%(name)s - "
                          "%(levelname)s - %(message)s")
    # logFormatter = Formatter("%(asctime)s %(name)-40s %(levelname)-8s %(message)s")
    handler.setFormatter(formatter)
    logger.addHandler(handler)
    logger.setLevel(log_level)

    # adding console log, for developers purpose
    ch = StreamHandler()
    ch.setFormatter(formatter)
    logger.addHandler(ch)

    # logger.info("Log started, log file %s, log level %s" % (log_file, INFO))
    return logger
