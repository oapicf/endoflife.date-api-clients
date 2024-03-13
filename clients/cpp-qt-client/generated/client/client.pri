QT += network

HEADERS += \
# Models
    $${PWD}/OAICycle.h \
    $${PWD}/OAICycle_cycle.h \
    $${PWD}/OAICycle_discontinued.h \
    $${PWD}/OAICycle_eol.h \
    $${PWD}/OAICycle_lts.h \
    $${PWD}/OAICycle_support.h \
# APIs
    $${PWD}/OAIDefaultApi.h \
# Others
    $${PWD}/OAIHelpers.h \
    $${PWD}/OAIHttpRequest.h \
    $${PWD}/OAIObject.h \
    $${PWD}/OAIEnum.h \
    $${PWD}/OAIHttpFileElement.h \
    $${PWD}/OAIServerConfiguration.h \
    $${PWD}/OAIServerVariable.h \
    $${PWD}/OAIOauth.h

SOURCES += \
# Models
    $${PWD}/OAICycle.cpp \
    $${PWD}/OAICycle_cycle.cpp \
    $${PWD}/OAICycle_discontinued.cpp \
    $${PWD}/OAICycle_eol.cpp \
    $${PWD}/OAICycle_lts.cpp \
    $${PWD}/OAICycle_support.cpp \
# APIs
    $${PWD}/OAIDefaultApi.cpp \
# Others
    $${PWD}/OAIHelpers.cpp \
    $${PWD}/OAIHttpRequest.cpp \
    $${PWD}/OAIHttpFileElement.cpp \
    $${PWD}/OAIOauth.cpp
