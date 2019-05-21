package leo.com.pumpyourself.controllers.meal.extras

import leo.com.pumpyourself.R
import leo.com.pumpyourself.common.setCircleImgResource
import leo.com.pumpyourself.common.setCircleImgUrl
import leo.com.pumpyourself.controllers.base.recycler.LazyAdapter
import leo.com.pumpyourself.databinding.ItemMealBinding
import leo.com.pumpyourself.databinding.ItemMealUnitBinding

class MealUnitAdapter : LazyAdapter<ItemMealUnit, ItemMealUnitBinding>() {

    override fun bindData(data: ItemMealUnit, binding: ItemMealUnitBinding) {
        binding.tvName.text = data.name
        binding.tvWeight.text = data.value
    }

    override fun getLayoutId(): Int = R.layout.item_meal_unit

}

class MealAdapter(onClick: OnItemClickListener<ItemMeal>) : LazyAdapter<ItemMeal, ItemMealBinding>(onClick) {

    override fun bindData(data: ItemMeal, binding: ItemMealBinding) {
        binding.tvName.text = data.name
        binding.tvValue.text = data.value
        binding.cvContainer.setOnClickListener { itemClickListener?.onLazyItemClick(data) }

        if (data.imgUrl.isNotEmpty()) {
            binding.ivIcon.setCircleImgUrl(data.imgUrl)
        } else {
            binding.ivIcon.setCircleImgResource(R.drawable.ic_launcher_background)
        }
    }

    override fun getLayoutId(): Int = R.layout.item_meal

}