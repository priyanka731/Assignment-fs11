package com.priyanka.Mapping_WeeklyTest.Repository;

import com.priyanka.Mapping_WeeklyTest.Model.Laptop;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
    @Transactional
    @Modifying
    @Query("delete from Laptop where laptopId=:laptopId")
    public void deleteLaptop(@Param("laptopId") Long laptopId);

    @Transactional
    @Modifying
    @Query("update Laptop set laptopBrand =:laptopBrand where laptopId = :laptopId")
    public void updateLaptopBrand(@Param("laptopBrand") String laptopBrand, @Param("laptopId") Long laptopId);
}