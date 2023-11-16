package com.bit.lot.flower.auth.social.dto.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SocialLoginRequestCommand {
  private String socialId;
  private String email;
  private String nickname;
}