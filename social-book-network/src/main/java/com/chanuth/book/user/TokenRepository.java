package com.chanuth.book.user;

import java.util.Optional;

public interface TokenRepository {//extends JpaRepository<Token, Integer> {

    Optional<Token> findByToken(String token);
}
