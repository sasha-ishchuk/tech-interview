package com.sasha.techiterview.systemevent;

public record SystemEvent(
    int userId,
    int deviceId,
    String timeLogIn,
    String timeLogOut
) {}
