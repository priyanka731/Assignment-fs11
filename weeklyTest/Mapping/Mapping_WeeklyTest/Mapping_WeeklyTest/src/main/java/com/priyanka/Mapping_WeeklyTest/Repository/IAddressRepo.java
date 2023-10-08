package com.priyanka.Mapping_WeeklyTest.Repository;

import com.priyanka.Mapping_WeeklyTest.Model.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {
    @Transactional
    @Modifying
    @Query("delete from Address where addressId=:addressId")
    public void deleteAddress(@Param("addressId") Long addressId);

    @Transactional
    @Modifying
    @Query("update Address set addressState =:addressState where addressId = :addressId")
    public void updateAddressState(@Param("addressState") String addressState, @Param("addressId") Long addressId);
}