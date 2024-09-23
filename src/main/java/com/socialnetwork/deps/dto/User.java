package com.socialnetwork.deps.dto;

import lombok.Builder;

import java.util.UUID;

@Builder
public record User(UUID id, String firstName, String lastName, byte[] cover) {
}
