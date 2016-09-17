class Node < ActiveRecord::Base
  belongs_to :graph

  validates :label, :x, :y, :type, :grap_id, presence: true
end
