package org.license.demo.ums.dto;

import lombok.Getter;
import lombok.Setter;
import org.license.demo.ums.model.UmsMenu;

import java.util.List;

/**
 * 后台菜单节点封装
 * Created by macro on 2020/2/4.
 */
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    private List<UmsMenuNode> children;
}
