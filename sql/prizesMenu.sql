-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('中奖区间信息', '2007', '1', 'prizes', 'lottery/prizes/index', 1, 0, 'C', '0', '0', 'lottery:prizes:list', '#', 'admin', sysdate(), '', null, '中奖区间信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('中奖区间信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'lottery:prizes:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('中奖区间信息新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'lottery:prizes:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('中奖区间信息修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'lottery:prizes:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('中奖区间信息删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'lottery:prizes:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('中奖区间信息导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'lottery:prizes:export',       '#', 'admin', sysdate(), '', null, '');