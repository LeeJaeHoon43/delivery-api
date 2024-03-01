package com.fastcampus.deliveryapi.repository.menu

import com.fastcampus.deliveryapi.domain.catalog.menu.MenuStatus
import com.fastcampus.deliveryapi.repository.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.OffsetDateTime

@Entity
@Table(name = "menus", catalog = "food_delivery")
class Menu(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuId", nullable = false)
    val menuId: Long = -1,

    @Column(name = "storeId", nullable = false)
    val storeId: Long,

    @Column(name = "menuName", nullable = false)
    val menuName: String,

    @Column(name = "menuMainImage", nullable = false)
    val menuMainImageUrl: String,

    @Column(name = "price", nullable = false)
    val price: BigDecimal,

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status", nullable = false)
    val menuStatus: MenuStatus = MenuStatus.READY,

    @Column(name = "description", nullable = false)
    val description: String,

): BaseEntity()